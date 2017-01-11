package org.cheng.study.mdc.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.PropertyConfigurator;

import java.net.ConnectException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 * @author li.cheng
 * @version 1.0.0 2017年01月10日
 * @since soter 1.0.0
 */
public class BuilderLog {
    private static Logger log = Logger.getLogger(BuilderLog.class);

    static {
        PropertyConfigurator.configure(BuilderLog.class.getResource("/log4j.xml"));
    }

    public static void main(String[] args) {
//        MDC.put("userId", "aaa");
//        log.debug("is debug");
//        log.info("is info");
//        log.warn("is warn");
//        log.error("is error", new Exception("erorrrrrrrrrrrrrr"));
//        new Thread(() ->{
//            log.debug("is thread debug");
//            log.info("is thread info");
//            log.warn("is thread warn");
//            log.error("is error", new Exception("erorrrrrrrrrrrrrr"));
//        }).start();
        ExecutorService executorService = Executors.newCachedThreadPool();

        String[] actions = {"search", "list", "add", "modify", "delete"};
        String[] users = {"user-a", "user-b", "user-c", "user-d", "user-e"};
        Random random = new Random();
        while (true) {
            IntStream.rangeClosed(1, 1000).parallel().forEach(i -> {
                int u = random.nextInt(5);
                int a = random.nextInt(5);
                System.out.println("random.nextInt() = " + u);
                Future<?> future = executorService.submit(() -> {
                    MDC.put("userId", users[u]);
                    log.info("has " + actions[a]);
                    int e = random.nextInt(10);
                    if (e > 8) {
                        log.error("Future对象不能为空", new NullPointerException("Future对象不能为空"));
                    } else if (e > 7) {
                        log.error("该流程已经关闭,无法操作", new RuntimeException("该流程已经关闭,无法操作"));
                    } else if (e > 6) {
                        log.error("数字格式错误", new NumberFormatException("数字格式错误"));
                    } else if (e > 5) {
                        log.error("链接已经断开", new ConnectException("链接已经断开"));
                    } else if (e > 4) {
                        log.error("栈溢出", new StackOverflowError("栈溢出"));
                    }

                });
                try {
                    future.get();
                } catch (Exception e) {
                    log.error("error has " + actions[a], e);
                }
            });
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                log.error("睡过头了", e);
            }
        }
    }
}
