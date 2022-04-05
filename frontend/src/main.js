import {createApp} from 'vue'
import App from './App.vue'
import router from './router'

//eslint-disable-next-line

import Datepicker from '@vuepic/vue-datepicker'
import '@vuepic/vue-datepicker/dist/main.css'

const app = createApp(App)

app.component('DatepickerA', Datepicker)

app.use(router);
app.mount('#app')