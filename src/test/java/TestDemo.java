import com.cctv.bean.News;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDemo {


//    查询所有新闻
    @Test
    public void testDemo1() throws IOException {
        //初始化mybatis配置环境
        String resource = "mybatis.xml";

        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

//        打开和数据库之间的会话
        SqlSession session = factory.openSession();
        List<News> nlist = session.selectList("newsList");

        for (News news: nlist){
            System.out.println(news);
        }

        session.close();//关闭资源


    }

//    查询一条新闻

    @Test
    public void testDemo2() throws IOException {
        //初始化mybatis配置环境
        String resource = "mybatis.xml";

        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

//        打开和数据库之间的会话
        SqlSession session = factory.openSession();



        News newsInfo = session.selectOne("newsDetails","32");

            System.out.println(newsInfo);


        session.close();//关闭资源


    }



}
