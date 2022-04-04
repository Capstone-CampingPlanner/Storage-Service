<template>
  <h1>보관함 상세보기</h1>
  <input type="text" v-model="managerId">
  <div class="storage">
    <!--  관리하는 보관함 보기 -->

  </div>
  <div class="storage-box">
    <!--    보관함 확인-->

  </div>
</template>

<script>
export default {
  name: "StorageDetail",
  data() {
    return {
      managerId: ''
    }
  }
}
</script>

<style scoped>

</style>