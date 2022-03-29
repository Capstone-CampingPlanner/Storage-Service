<template>
  <h1>Appvue</h1>
  <StorageService></StorageService>
</template>

<script>

import StorageService from "@/components/StorageService.vue";
export default {
  name: 'App',
  components: {
    StorageService
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
