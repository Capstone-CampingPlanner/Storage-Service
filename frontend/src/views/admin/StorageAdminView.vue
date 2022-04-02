<template>
  <h1>관리자</h1>
  <div>
    <table class="menu-bar">
      <tbody>
      <tr>
        <td>
          <router-link :to="{name:'storage'}">storage</router-link>
        </td>
        <td>
          <router-link :to="{name:'manager'}">manager</router-link>
        </td>
      </tr>
      </tbody>
    </table>
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