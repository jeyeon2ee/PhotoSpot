import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
// 3rd party library
import { library } from '@fortawesome/fontawesome-svg-core'
import { faUserSecret } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

library.add(faUserSecret)

const app = createApp(App)

app.use(router)
app.use(store)

app.component('font-awesome-icon', FontAwesomeIcon)

app.mount('#app')