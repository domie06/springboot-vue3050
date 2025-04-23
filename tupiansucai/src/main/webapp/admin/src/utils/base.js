const base = {
    get() {
        return {
            url : "http://localhost:8080/tupiansucai/",
            name: "tupiansucai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/tupiansucai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "图片素材网站"
        } 
    }
}
export default base
