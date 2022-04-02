<!-- storage admin page(storage)-->
<template>
  <div class="storage-view-main">
    <table class="menu-bar">
      <tbody>
      <tr>
        <td>
          <p @click="getStorage"> 리스트 </p>
        </td>
        <td>
          <p @click="inputStorage"> 추가 </p>
        </td>
      </tr>
      </tbody>
    </table>
  </div>
  <div>
    <div v-if="get">
      <GetStorage></GetStorage>
    </div>
    <div v-if="input">
      <InputStorage></InputStorage>
    </div>
  </div>

</template>

<script>
import InputStorage from '@/components/storageService/admin/storage/InputStorage.vue'
import GetStorage from "@/components/storageService/admin/storage/GetStorage";

export default {

  name: "StorageView",
  components: {
    InputStorage,
    GetStorage
  },
  mounted() {
  },
  data() {
    return {
      get: true,
      input: false
    }
  },
  methods: {
    getStorage() {
      this.get = true
      this.input = false
    },
    inputStorage() {
      this.input = true
      this.get = false
    }
  }

}
</script>

<style scoped>

</style>