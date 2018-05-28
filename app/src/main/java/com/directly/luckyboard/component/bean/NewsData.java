package com.directly.luckyboard.component.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:18
 */

public class NewsData {

    /**
     * curPage : 1
     * datas : [{"apkLink":"","author":"中国大学MOOC","chapterId":361,"chapterName":"课程推荐","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":2953,"link":"http://www.icourse163.org/learn/ZJU-93001?tid=1002654021#/learn/content","niceDate":"3小时前","origin":"","projectLink":"","publishTime":1527476390000,"superChapterId":249,"superChapterName":"干货资源","tags":[],"title":"浙江大学-数据结构课程","type":0,"userId":-1,"visible":1,"zan":0," d6c collect":false},{"apkLink":"","author":"鸿洋公众号","chapterId":361,"chapterName":"课程推荐","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":2952,"link":"https://mp.weixin.qq.com/s/GaFLNWbu7v-9cPyBgomvhA","niceDate":"6小时前","origin":"","projectLink":"","publishTime":1527465725000,"superChapterId":249,"superChapterName":"干货资源","tags":[],"title":"大数据免费直播课程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"MrTangFB ","chapterId":140,"chapterName":"dagger2","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2951,"link":"https://www.jianshu.com/p/b989e2cb88f6","niceDate":"2天前","origin":"","projectLink":"","publishTime":1527306361000,"superChapterId":55,"superChapterName":"5.+高新技术","tags":[],"title":"Android Dagger2 从零单排(四) Dependencies与SubComponent","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"goldze","chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"基于DataBinding框架，MVVM设计模式的一套快速开发库，整合Okhttp+RxJava+Retrofit+Glide等主流库，满足日常开发需求。使用该框架可以快速开发一个Android应用。\r\n","envelopePic":"http://www.wanandroid.comresources/image/pc/default_project_img.jpg","fresh":false,"id":2950,"link":"http://www.wanandroid.com/blog/show/2141","niceDate":"2天前","origin":"","projectLink":"https://github.com/goldze/MVVMHabit","publishTime":1527299243000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"MVVM设计模式的一套快速开发库 MVVMHabit","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"zj565061763","chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"一个控制控件单选、多选状态的库 ~","envelopePic":"http://www.wanandroid.com/blogimgs/0a915128-b38d-4452-b6cc-1554f9f26c97.gif","fresh":false,"id":2949,"link":"http://www.wanandroid.com/blog/show/2140","niceDate":"2天前","origin":"","projectLink":"https://github.com/zj565061763/selectmanager","publishTime":1527298668000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"一个控制控件单选、多选状态的库  selectmanager","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"编走编想","chapterId":245,"chapterName":"集合相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2948,"link":"https://www.jianshu.com/p/b5bc4b7ff236","niceDate":"2天前","origin":"","projectLink":"","publishTime":1527296472000,"superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"Java 的泛型擦除和运行时泛型信息获取","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"邱明成","chapterId":346,"chapterName":"JVM","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2947,"link":"https://www.cnblogs.com/qiumingcheng/p/5398610.html","niceDate":"2天前","origin":"","projectLink":"","publishTime":1527234120000,"superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"Java程序编译和运行的过程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"HIT-Alibaba","chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2945,"link":"https://hit-alibaba.github.io/interview/basic/network/HTTP.html","niceDate":"2018-05-22","origin":"","projectLink":"","publishTime":1526988545000,"superChapterId":61,"superChapterName":"热门专题","tags":[],"title":"笔试面试知识整理","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"RaphetS","chapterId":67,"chapterName":"网络基础","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2944,"link":"https://www.jianshu.com/p/80e25cb1d81a","niceDate":"2018-05-22","origin":"","projectLink":"","publishTime":1526987358000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"关于HTTP协议，一篇就够了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"张芳涛","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2943,"link":"https://www.jianshu.com/p/5baf47e7c4cb","niceDate":"2018-05-22","origin":"","projectLink":"","publishTime":1526986888000,"superChapterId":97,"superChapterName":"多媒体技术","tags":[],"title":"《FFmpeg Basics》中文版-目录","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"鸿洋公众号","chapterId":121,"chapterName":"ViewPager","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2942,"link":"https://mp.weixin.qq.com/s/JlKtnVU_DqUwYAlQXXyniQ","niceDate":"2018-05-22","origin":"","projectLink":"","publishTime":1526950846000,"superChapterId":26,"superChapterName":"常用控件","tags":[],"title":"ViewPager 刷新无效?","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"网易杭州前端技术部","chapterId":270,"chapterName":"埋点","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2941,"link":"https://mp.weixin.qq.com/s/0dHKu5QIBL_4S7Tum-qW2Q","niceDate":"2018-05-21","origin":"","projectLink":"","publishTime":1526910498000,"superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"网易HubbleData之Android无埋点实践","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"leowudev","chapterId":245,"chapterName":"集合相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2940,"link":"https://www.jianshu.com/p/e23e3fb2d326","niceDate":"2018-05-21","origin":"","projectLink":"","publishTime":1526901349000,"superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"高手不得不知的Java集合List的细节","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"JessYanCoding","chapterId":324,"chapterName":"组件化","collect":false,"courseId":13,"desc":"MVPArms 官方快速组件化方案~","envelopePic":"http://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":2938,"link":"http://www.wanandroid.com/blog/show/2137","niceDate":"2018-05-21","origin":"","projectLink":"https://github.com/JessYanCoding/ArmsComponent","publishTime":1526883918000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=324"}],"title":"MVPArms 官方快速组件化方案 ArmsComponent","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"JessYanCoding","chapterId":324,"chapterName":"组件化","collect":false,"courseId":13,"desc":"一键搭建 ArmsComponent 快速组件化方案的整体组件架构, 让新手也可以一秒开始组件化项目, 开发神器, 让您一秒起飞, 体验纯傻瓜式的组件化开发, 避免组件化从入门到放弃!\r\n","envelopePic":"http://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":2939,"link":"http://www.wanandroid.com/blog/show/2138","niceDate":"2018-05-21","origin":"","projectLink":"https://github.com/JessYanCoding/ArmsComponent-Template","publishTime":1526883892000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=324"}],"title":"一键搭建 ArmsComponent 快速组件化方案的整体组件架构 ArmsComponent-Template ","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识"," d6c collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2937,"link":"https://www.jianshu.com/p/ca118d704b5e","niceDate":"2018-05-20","origin":"","projectLink":"","publishTime":1526805757000,"superChapterId":134,"superChapterName":"自定义控件","tags":[],"title":"为什么你的自定义View wrap_content不起作用？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"DreaminginCodeZH","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"开源的 Material Design 豆瓣客户端（A Material Design app for douban.com）","envelopePic":"http://www.wanandroid.com/blogimgs/77c507a7-daec-4414-a857-939d09eceb8f.png","fresh":false,"id":2933,"link":"http://www.wanandroid.com/blog/show/2133","niceDate":"2018-05-18","origin":"","projectLink":"https://github.com/DreaminginCodeZH/Douya","publishTime":1526614457000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"开源的 Material Design 豆瓣客户端 Douya","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"RmondJone","chapterId":357,"chapterName":"表格类","collect":false,"courseId":13,"desc":"Android自定义表格，支持锁双向表头，自适应列宽，自适应行高,快速集成。","envelopePic":"http://www.wanandroid.com/blogimgs/44cfdbbd-9128-4cb3-a45f-331c759dbd45.png","fresh":false,"id":2935,"link":"http://www.wanandroid.com/blog/show/2135","niceDate":"2018-05-17","origin":"","projectLink":"https://github.com/RmondJone/LockTableView","publishTime":1526556772000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=357"}],"title":"Android自定义表格 LockTableView","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"zyyoona7","chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"PopupWindow Wrapper. 对 PopupWindow 的封装。可指定相对于 anchor view 各个方位弹出，设置背景变暗，指定 ViewGroup 背景变暗等特性。\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/4d5b5bf8-6f0d-406e-8940-87853c5aa18f.gif","fresh":false,"id":2934,"link":"http://www.wanandroid.com/blog/show/2134","niceDate":"2018-05-17","origin":"","projectLink":"https://github.com/zyyoona7/EasyPopup","publishTime":1526556684000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"对 PopupWindow 的封装 EasyPopup","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"REBOOTERS","chapterId":323,"chapterName":"动画","collect":false,"courseId":13,"desc":"Android 动画各种实现，包括帧动画、补间动画和属性动画的总结分享\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/cb78f8ad-8e88-4be5-b383-6b9ad910fc9d.gif","fresh":false,"id":2932,"link":"http://www.wanandroid.com/blog/show/2132","niceDate":"2018-05-17","origin":"","projectLink":"https://github.com/REBOOTERS/AndroidAnimationExercise","publishTime":1526555923000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=323"}],"title":"Android 动画各种实现总结分享 AndroidAnimationExercise","type":0,"userId":-1,"visible":1,"zan":0}]
     * offset : 0
     * over : false
     * pageCount : 66
     * size : 20
     * total : 1306
     */

    private int curPage;
    private int offset;
    private boolean over;
    private int pageCount;
    private int size;
    private int total;
    private List<DatasBean> datas;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * apkLink :
         * author : 中国大学MOOC
         * chapterId : 361
         * chapterName : 课程推荐
         * collect : false
         * courseId : 13
         * desc :
         * envelopePic :
         * fresh : true
         * id : 2953
         * link : http://www.icourse163.org/learn/ZJU-93001?tid=1002654021#/learn/content
         * niceDate : 3小时前
         * origin :
         * projectLink :
         * publishTime : 1527476390000
         * superChapterId : 249
         * superChapterName : 干货资源
         * tags : []
         * title : 浙江大学-数据结构课程
         * type : 0
         * userId : -1
         * visible : 1
         * zan : 0
         * d6c collect : false
         */

        private String apkLink;
        private String author;
        private int chapterId;
        private String chapterName;
        private boolean collect;
        private int courseId;
        private String desc;
        private String envelopePic;
        private boolean fresh;
        private int id;
        private String link;
        private String niceDate;
        private String origin;
        private String projectLink;
        private long publishTime;
        private int superChapterId;
        private String superChapterName;
        private String title;
        private int type;
        private int userId;
        private int visible;
        private int zan;
        @SerializedName(" d6c collect")
        private boolean _$D6cCollect31; // FIXME check this code
        private List<?> tags;

        public String getApkLink() {
            return apkLink;
        }

        public void setApkLink(String apkLink) {
            this.apkLink = apkLink;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getChapterId() {
            return chapterId;
        }

        public void setChapterId(int chapterId) {
            this.chapterId = chapterId;
        }

        public String getChapterName() {
            return chapterName;
        }

        public void setChapterName(String chapterName) {
            this.chapterName = chapterName;
        }

        public boolean isCollect() {
            return collect;
        }

        public void setCollect(boolean collect) {
            this.collect = collect;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getEnvelopePic() {
            return envelopePic;
        }

        public void setEnvelopePic(String envelopePic) {
            this.envelopePic = envelopePic;
        }

        public boolean isFresh() {
            return fresh;
        }

        public void setFresh(boolean fresh) {
            this.fresh = fresh;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getNiceDate() {
            return niceDate;
        }

        public void setNiceDate(String niceDate) {
            this.niceDate = niceDate;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getProjectLink() {
            return projectLink;
        }

        public void setProjectLink(String projectLink) {
            this.projectLink = projectLink;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public int getSuperChapterId() {
            return superChapterId;
        }

        public void setSuperChapterId(int superChapterId) {
            this.superChapterId = superChapterId;
        }

        public String getSuperChapterName() {
            return superChapterName;
        }

        public void setSuperChapterName(String superChapterName) {
            this.superChapterName = superChapterName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public int getZan() {
            return zan;
        }

        public void setZan(int zan) {
            this.zan = zan;
        }

        public boolean is_$D6cCollect31() {
            return _$D6cCollect31;
        }

        public void set_$D6cCollect31(boolean _$D6cCollect31) {
            this._$D6cCollect31 = _$D6cCollect31;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }
    }
}
