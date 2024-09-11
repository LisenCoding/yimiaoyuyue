/*
 * @Description: 
 * @Author: Rabbiter
 * @Date: 2024-03-14 20:02:29
 */
module.exports = {
    lintOnSave: false, // 关闭eslint校验
    devServer: {
        host: "localhost",
        port: 9282,
        https: false,
        proxy: "http://localhost:9281",
        overlay: { // 关闭eslint校验
            warning: false,
            errors: false
        },
    }
}
//设置代理解决跨域问题