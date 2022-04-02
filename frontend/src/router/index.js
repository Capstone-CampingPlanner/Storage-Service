import {createWebHistory, createRouter} from "vue-router";
import UserStorageDetail from "@/components/storageService/user/UserStorageDetail.vue";

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
        component: ()=> import('@/views/user/UserStorageView.vue'),
        children: [
            {
                path: ':storageCode',
                name:'detail',
                component: UserStorageDetail
            }
        ]
    },



];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;