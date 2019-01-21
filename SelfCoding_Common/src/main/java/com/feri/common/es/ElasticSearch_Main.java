package com.feri.common.es;

import com.alibaba.fastjson.JSON;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.sort.SortOrder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

/**
 *@Author feri
 *@Date Created in 2019/1/19 11:29
 */
public class ElasticSearch_Main {

    public static String host="39.105.189.141";

    public static void main(String[] args) throws UnknownHostException {
        //1、创建配置对象
        Settings settings=Settings.builder().put("cluster.name","qfjava").build();
        //2、创建客户端对象
        Client client=new PreBuiltTransportClient(settings).addTransportAddress(
                new TransportAddress(InetAddress.getByName(host),9300));
        //3、新增索引
   /*     User user1=new User();
        user1.setFlag(1);
        user1.setId(444);
        user1.setPhone("88888");
        //新增数据 如果对应的id存在就是修改  参数说明：1、索引名称 唯一 2、数据对应的类型名称 3、对应数据的唯一标记 id
        //setSource 设置需要天津队额数据源 参数说明：1、对应的json的数据内容 2、添加的数据格式
        IndexResponse indexResponse=client.prepareIndex("1806users","user",user1.getId()+"").
                setSource(JSON.toJSONString(user1),XContentType.JSON).get();
        System.out.println("新增数据："+indexResponse.status().toString());
        User user2=new User();
        user2.setFlag(1);
        user2.setId(1001);
        user2.setPhone("66666");
       UpdateResponse updateResponse= client.prepareUpdate("1806users","user",
               user2.getId()+"").setDoc(JSON.toJSONString(user2),XContentType.JSON).get();
        System.out.println("修改："+updateResponse.status().toString());
        //删除
        DeleteResponse deleteResponse=client.prepareDelete("1806users","teach","222").get();
        System.out.println("删除："+deleteResponse.status().toString());
        //查询
        GetResponse getResponse=client.prepareGet("1806users","user","1").get();
        System.out.println("查询："+getResponse.getSourceAsString());*/
        //复杂查询
        SearchResponse searchResponse=client.prepareSearch("1806users").setQuery(
                QueryBuilders.matchAllQuery()).addSort("id",SortOrder.DESC).get();
        //获取查询的结果集
        SearchHits searchHits=searchResponse.getHits();
        System.out.println("数量："+searchHits.totalHits);
        Iterator<SearchHit> hitIterator=searchHits.iterator();
        while (hitIterator.hasNext()){
            SearchHit searchHit=hitIterator.next();
            System.out.println("结果："+searchHit.getSourceAsString());
        }

        //fuzzyQuery 相似度查询
        //wildcardQuery 模糊查询 ** m模糊度
        //matchQuery 支持中文分词
        //rangeQuery 范围查询
        SearchResponse searchResponse1=client.prepareSearch("1806users").setQuery(
                QueryBuilders.wildcardQuery("phone","*6*")).addSort("id",SortOrder.DESC).get();
        //获取查询的结果集
        SearchHits searchHits1=searchResponse1.getHits();
        System.out.println("数量："+searchHits1.totalHits);
        Iterator<SearchHit> hitIterator1=searchHits1.iterator();
        while (hitIterator1.hasNext()){
            SearchHit searchHit=hitIterator1.next();
            System.out.println("结果："+searchHit.getSourceAsString());
        }

    }
}
