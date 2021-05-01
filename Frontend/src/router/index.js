import { createRouter, createWebHistory } from 'vue-router'
import home from '../views/home.vue'
import login from '../views/login.vue'
import ModalTest from '../views/ModalTest.vue'
import CarouselTest from '../views/CarouselTest.vue'

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
        },
        {
            path: '/modaltest',
            name: 'ModalTest',
            component : ModalTest
        },
        {
            path: '/carousel',
            name: 'CarouselTest',
            component : CarouselTest
        }
    ]
})
export default router