<template>
  <h1>메인페이지</h1>
  <div>
    <ul>
      <li>
        <router-link :to="{name:'home'}">home</router-link>
      </li>
      <li>
        <router-link :to="{name:'storage'}">storage</router-link>
      </li>
      <li>
        <router-link :to="{name:'manager'}">manager</router-link>
      </li>
    </ul>
  </div>

  <div>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: "StorageService"
}
</script>

<style scoped>

</style>