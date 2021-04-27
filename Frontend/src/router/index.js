import { createRouter, createWebHistory } from 'vue-router'
import home from '../views/home.vue'
import login from '../views/login.vue'
import SignUp from '../views/SignUp.vue'
import ModalTest from '../views/ModalTest.vue'

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
        }
    ]
})
export default router