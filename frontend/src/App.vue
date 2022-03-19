<template>
  <h1>메인서비스 입니다</h1>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import storageService from "@/components/storageService";


export default {
  name: 'App',
  components: {
    HelloWorld,
    storageService

  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
