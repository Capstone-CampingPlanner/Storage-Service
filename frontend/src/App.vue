<template>
  <h1>메인서비스 입니다</h1>
  <storage-vue></storage-vue>
  <router-view />
</template>

<script>
import StorageVue from "@/views/storageVue";
export default {
  name: 'App',
  components: {
    StorageVue

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
