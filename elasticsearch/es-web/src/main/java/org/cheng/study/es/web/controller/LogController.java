package org.cheng.study.es.web.controller;

import org.cheng.study.es.sdk.Clients;
import org.cheng.study.es.web.controller.dto.JsonRetPageDto;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.elasticsearch.index.query.QueryBuilders.*;
/**
 * @author li.cheng
 * @version 1.0.0 2017年01月12日
 * @since soter 1.0.0
 */
@RestController
@RequestMapping("/soterlog")
public class LogController extends BaseController {

    @RequestMapping("/search/{key}")
    public JsonRetPageDto search(@PathVariable(name = "key") String key){
        SearchRequestBuilder search = Clients.getClient().prepareSearch("log-soter");
        search.setQuery(boolQuery()
                .must(queryStringQuery(key).field("message"))
//                        .filter(rangeQuery("@timestamp")
//                                .from(dateFormat.parse("2016/12/29 10:02:02"))
//                                .to(dateFormat.parse("2016/12/29 10:03:02"))
//                                .includeLower(true)
//                                .includeUpper(true)
//                        )
        );
        search.setFrom(0).setSize(100).setExplain(true);
        SearchResponse searchResponse = search.execute().actionGet();
        SearchHits hits = searchResponse.getHits();
        List<Map<String,Object>> data = new ArrayList<>();
        hits.forEach(hit->{
            data.add(hit.getSource());
        });
        return setPage(1,100,hits.getTotalHits(),data);
    }
}
