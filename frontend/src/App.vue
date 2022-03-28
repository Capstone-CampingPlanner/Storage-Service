<template>
  <h1>메인서비스 입니다</h1>
  <StorageManagementView></StorageManagementView>
</template>

<script>
import StorageManagerView from "@/components/StorageManagerView";
export default {
  name: 'App',
  components: {
    StorageManagerView

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
