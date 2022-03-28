<template>
  <div class="manager-add">
    <input type="text" v-model="form.manager_id"  placeholder="아이디">
    <input type="text" v-model="form.storage_code" placeholder="보관소코드">
    <button @click="postManager()">ADD</button>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "StorageManagerAdd",
  data() {
    return {
      form: {
        manager_id: '',
        storage_code: ''
      },
      errorCheck: false
    }
  },
  methods: {
    inputCheck() {
      if (!this.manager_id) {
        alert('매니저를 입력하세요')
      } else if (!this.storage_code) {
        alert('보관소 입력하세요')
      } else {
        this.errorCheck = true
      }
    },
    clearInput() {
      this.form.manager_id = ''
      this.form.storage_code = ''
    },
    postManager() {
      this.inputCheck()
      if (this.errorCheck) {
        axios.post('api/postManager', this.form)
            .then((res) => {
              console.log(this.form)
              if (res === 'ok') {
                console.log('중복없음')
              } else {
                console.log('중복')
              }
            }).catch((err) => {
          console.log(err)
        })
        this.clearInput()
      }
    }
  }
}
</script>

<style scoped>

</style>