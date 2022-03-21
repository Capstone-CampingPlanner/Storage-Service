import {createApp} from 'vue'
import App from './App.vue'
import router from './router'
import views from './views'

createApp().config.productionTip = false
const app = create
+App(App)

app.use(views);
app.use(router);
app.mount('#app')