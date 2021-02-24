package org.example;

import com.huaban.analysis.jieba.JiebaSegmenter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordSegDemo {
    public static void main( String[] args ) {
        JiebaSegmenter segmenter = new JiebaSegmenter();
        // 传入中文词语(如清洗后名称、地址)
        String word = "快手总部停车场";
        // 定义ArrayList
        ArrayList wordSegList = new ArrayList();
        // 进行分词
        wordSegList = (ArrayList) segmenter.sentenceProcess(word);
        System.out.println(wordSegList); //得到ArrayList[快手, 总部, 停车场]
        // 然后在词典中搜索wordSegList中每个词对应的固定长度(200)的double型数组,若某个词语搜索不到,则设为默认值长度200各元素为0的数组
        // 得到全部词对应的向量后，将所有向量加个，得到最终长度为200的数组，代表整个word的词向量
    }
}
