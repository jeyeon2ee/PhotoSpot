import { createRouter, createWebHistory } from 'vue-router'
import home from '../views/home.vue'
import login from '../views/login.vue'

const routerHistory = createWebHistory()

const router = createRouter({
    history: routerHistory,
    routes: [
        {
            path: '/',
            name: 'Home',
            component :home
        },
        {
            path: '/login',
            name: 'Login',
            component :login
        }
    ]
})
export default router