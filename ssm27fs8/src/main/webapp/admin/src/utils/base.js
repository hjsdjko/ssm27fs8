const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm27fs8/",
            name: "ssm27fs8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm27fs8/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园约拍微信小程序"
        } 
    }
}
export default base
