import {createWebHistory, createRouter} from "vue-router";

const routes = [
    {
        path: "/",
        name: "home",
        component: ()=> import('@/views/admin/StorageAdminView.vue')
    },
    {
        path: "/storage",
        name: "storage",
        component: ()=> import('@/views/admin/storage/StorageView.vue')
    },
    {
        path: "/manager",
        name: "manager",
        component: ()=> import('@/views/admin/manager/StorageManagerView.vue')
    },
    {
        path: "/storageView",
        name:"userStorage",
        component: ()=> import('@/views/user/UserStorageView.vue')
    },
    {
        path:'/storageManager',
        name:'storageManager',
        component: ()=> import('@/views/manager/ManagerStorage.vue')
    }

]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router;