const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave:false
})

module.exports = {
  outputDir: "../src/main/resources/static",
  devServer: {
    proxy: {
      '/api': {
        // 'api'로 들어오면 포트 8484(스프링서버)
        target: 'http://localhost:8484',
        changeOrigin: true // cross origin
      },
      '/storage/api': {
        // 'storage/api'로 들어오면 포트 8484(스프링서버)
        target: 'http://localhost:8484',
        changeOrigin: true // cross origin
      }
    }
  }
}