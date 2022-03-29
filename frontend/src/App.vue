<template>
<<<<<<< HEAD
  <h1>Appvue</h1>
  <StorageService></StorageService>
</template>

<script>

import StorageService from "@/components/StorageService.vue";
export default {
  name: 'App',
  components: {
    StorageService
=======
  <h1>메인서비스 입니다</h1>
  <StorageManagementView></StorageManagementView>
</template>

<script>
import StorageManagerView from "@/components/StorageManagerView";
export default {
  name: 'App',
  components: {
    StorageManagerView

>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4
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
