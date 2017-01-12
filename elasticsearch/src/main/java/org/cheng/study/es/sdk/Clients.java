package org.cheng.study.es.sdk;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import static org.elasticsearch.index.query.QueryBuilders.boolQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;

/**
 * @author li.cheng
 * @version 1.0.0 2017年01月11日
 * @since soter 1.0.0
 */
public class Clients {
    public static final String CLUSTER_NAME = "es-cl"; //实例名称
    private static final String IP = "127.0.0.1";
    private static final int PORT = 9300;  //端口
    //1.设置集群名称：默认是elasticsearch，并设置client.transport.sniff为true，使客户端嗅探整个集群状态，把集群中的其他机器IP加入到客户端
    //对ES2.0有效
    private static Settings settings = Settings
            .settingsBuilder()
            .put("cluster.name", CLUSTER_NAME)
            .put("client.transport.sniff", true)
            .build();

    //创建私有对象
    private static TransportClient client;


    private static TransportClient init() {
        try {
            client = TransportClient.builder().settings(settings).build()
                    .addTransportAddress(
                            new InetSocketTransportAddress(InetAddress.getByName(IP), PORT)
                    );
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return client;
    }

    public static TransportClient getClient() {
        return null == client ? init() : client;
    }

    public static void main(String[] args) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        TransportClient client = getClient();
        SearchRequestBuilder search = client.prepareSearch("log-soter");
        search.setQuery(boolQuery()
//                .must(queryStringQuery("*Exception*").field("message"))
                        .filter(rangeQuery("@timestamp")
                                .from(dateFormat.parse("2016/12/29 10:02:02"))
                                .to(dateFormat.parse("2016/12/29 10:03:02"))
                                .includeLower(true)
                                .includeUpper(true)
                        )
        );
        search.setFrom(0).setSize(10).setExplain(true);
        SearchResponse searchResponse = search.execute().actionGet();
        System.out.println("searchResponse.getHits().getTotalHits() = " + searchResponse.getHits().getTotalHits());
        searchResponse.getHits().forEach(hit -> {
            System.out.println("hit.getSource() = " + hit.getSource().get("message"));
        });
//        System.out.println("searchResponse = " + searchResponse);
        client.close();
    }
}
