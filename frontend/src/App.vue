<template>
  <div>
    <h1>보관소 서비스</h1>
    <table class="menu-bar">
      <tbody>
      <tr>
        <td>
          <router-link :to="{name:'home'}">home</router-link>
        </td>
        <td>
          <router-link :to="{name:'userStorage'}">userStorage</router-link>
        </td>
      </tr>
      </tbody>
    </table>
    <div>
      <router-view/>
    </div>
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {}
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

table.menu-bar {
  border-collapse: collapse;
  width: 100%;
}
th, td {
  padding: 10px;
  border-bottom: 1px solid #CD5C5C;
}
tr:hover { background-color: #F5F5F5; }
</style>
