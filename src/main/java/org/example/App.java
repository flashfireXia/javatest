package org.example;
import com.huaban.analysis.jieba.JiebaSegmenter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        JiebaSegmenter segmenter = new JiebaSegmenter();
        System.out.println(segmenter.sentenceProcess("小明硕士毕业于中国科学院计算所，后在日本京都大学深造"));
        System.out.println(segmenter.sentenceProcess("这是一个伸手不见五指的黑夜"));
        System.out.println(segmenter.sentenceProcess("我是你爸爸，你个傻逼"));
        System.out.println(segmenter.sentenceProcess("北辰福第北区三号楼"));
    }
}
