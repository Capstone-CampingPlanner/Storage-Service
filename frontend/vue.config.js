const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})

module.exports = {
  outputDir: "../src/main/resources/static",
  devServer :{
    proxy:{
      '/api':{
        // 'api'로 들어오면 포트 8787(스프링서버)
        target: 'http://localhost:8787',
        changeOrigin: true // cross origin
      }
    }
  }
}