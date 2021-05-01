import { createRouter, createWebHistory } from 'vue-router'
import home from '../views/Home.vue'
import login from '../views/Login.vue'
import SignUp from '../views/SignUp.vue'
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
            path: '/signUp',
            name: 'SignUp',
            component : SignUp
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