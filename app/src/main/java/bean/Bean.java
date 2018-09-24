package bean;

import java.util.List;

/**
 * Created by YangYueXiang
 * on 2018/9/17
 */
public class Bean {

    /**
     * result : {"followCinemas":[],"nearbyCinemaList":[{"address":"北京市海淀区上地南口华联商厦4F","commentTotal":94,"distance":1647,"followCinema":false,"id":18,"logo":"http://172.17.8.100/images/movie/logo/ctjh.jpg","name":"橙天嘉禾影城北京上地店"},{"address":"北京海淀区海淀区清河中街68号五彩城购物中心东区7层","commentTotal":102,"distance":3315,"followCinema":false,"id":22,"logo":"http://172.17.8.100/images/movie/logo/CGVyc.jpg","name":"CGV影城（清河店）"},{"address":"北京海淀区悦秀路99号二层大地影院","commentTotal":39,"distance":3416,"followCinema":false,"id":19,"logo":"http://172.17.8.100/images/movie/logo/ddyy.jpg","name":"大地影院-北京海淀西三旗物美"},{"address":"北京市育知东路30号华联商厦4层","commentTotal":22,"distance":4838,"followCinema":false,"id":20,"logo":"http://172.17.8.100/images/movie/logo/wmyc.jpg","name":"北京沃美影城（回龙观店）"},{"address":"北京市昌平区黄平路19号院龙旗购物中心3层","commentTotal":6,"distance":5090,"followCinema":false,"id":17,"logo":"http://172.17.8.100/images/movie/logo/blgj.jpg","name":"保利国际影城北京龙旗广场店"},{"address":"海淀区中关村广场购物中心津乐汇三层（鼎好一期西侧）","commentTotal":4,"distance":6387,"followCinema":false,"id":12,"logo":"http://172.17.8.100/images/movie/logo/mjhlyc.jpg","name":"美嘉欢乐影城中关村店"},{"address":"北京市海淀区中关村大街19号新中关购物中心B1层","commentTotal":1,"distance":6982,"followCinema":false,"id":15,"logo":"http://172.17.8.100/images/movie/logo/jy.jpg","name":"金逸北京中关村店"},{"address":"北京市海淀区中关村大街28号","commentTotal":8,"distance":7224,"followCinema":false,"id":16,"logo":"http://172.17.8.100/images/movie/logo/hdjy.jpg","name":"海淀剧院"},{"address":"北京市海淀区远大路1号B座5层魔影国际影城","commentTotal":9,"distance":8836,"followCinema":false,"id":4,"logo":"http://172.17.8.100/images/movie/logo/mygj.jpg","name":"魔影国际影城"},{"address":"海淀区远大路1号金源时代购物中心5层东首","commentTotal":2,"distance":9140,"followCinema":false,"id":11,"logo":"http://172.17.8.100/images/movie/logo/xmgj.jpg","name":"星美国际影城"}]}
     * message : 查询成功
     * status : 0000
     */

    private ResultBean result;
    private String message;
    private String status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ResultBean {
        private List<?> followCinemas;
        private List<NearbyCinemaListBean> nearbyCinemaList;

        public List<?> getFollowCinemas() {
            return followCinemas;
        }

        public void setFollowCinemas(List<?> followCinemas) {
            this.followCinemas = followCinemas;
        }

        public List<NearbyCinemaListBean> getNearbyCinemaList() {
            return nearbyCinemaList;
        }

        public void setNearbyCinemaList(List<NearbyCinemaListBean> nearbyCinemaList) {
            this.nearbyCinemaList = nearbyCinemaList;
        }

        public static class NearbyCinemaListBean {
            /**
             * address : 北京市海淀区上地南口华联商厦4F
             * commentTotal : 94
             * distance : 1647
             * followCinema : false
             * id : 18
             * logo : http://172.17.8.100/images/movie/logo/ctjh.jpg
             * name : 橙天嘉禾影城北京上地店
             */

            private String address;
            private int commentTotal;
            private double distance;
            private boolean followCinema;
            private int id;
            private String logo;
            private String name;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getCommentTotal() {
                return commentTotal;
            }

            public void setCommentTotal(int commentTotal) {
                this.commentTotal = commentTotal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public boolean isFollowCinema() {
                return followCinema;
            }

            public void setFollowCinema(boolean followCinema) {
                this.followCinema = followCinema;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
