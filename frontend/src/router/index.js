import {createWebHistory, createRouter} from "vue-router";
import StorageAdd from "@/components/storageService/admin/StorageAdd.vue";
import StorageRevise from "@/components/StorageRevise.vue";
import StorageManagerAdd from "@/components/StorageManagerAdd.vue";
import GetStorageManagerPage from "@/components/GetStorageManagerPage.vue";
import UserStorageDetail from "@/components/storageService/user/UserStorageDetail.vue";

const routes = [
    {
        path: "/",
        name: "home",
        component: ()=> import('@/views/StorageService.vue')
    },
    {
        path: "/storage",
        name: "storage",
        component: ()=> import('@/views/StorageView.vue'),
        children: [
            {
                path: 'revise',
                component: StorageRevise
            },
            {
                path: 'add',
                name:'storageAdd',
                component: StorageAdd
            }
        ]
    },
    {
        path: "/manager",
        name: "manager",
        component: ()=> import('@/views/StorageManagerView'),
        children: [
            {
              path: '',
              component: GetStorageManagerPage
            },
            {
                path: 'add',
                component: StorageManagerAdd
            }
        ]
    },
    {
        path: "/storageView",
        component: ()=> import('@/views/user/UserStorageView'),
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