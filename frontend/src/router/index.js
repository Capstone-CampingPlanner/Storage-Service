import { createWebHistory, createRouter } from "vue-router";
import StorageManagementView from "@/components/StorageMenagementView.vue";
import StorageView from "@/components/StorageView.vue";
import StorageService from "@/components/StorageService.vue";
import StorageDetail from "@/components/StorageDetail.vue";
import GetStoragePage from "@/components/GetStoragePage";
import StorageRevise from "@/components/StorageRevise";

const routes = [
    {
        path: "/",
        name: "home",
        component: StorageService
    },
    {
        path: "/storage",
        name: "storage",
        component: StorageView,
        children:[
            {
                path:'/storage/getStoragePage',
                name:'storageList',
                component: GetStoragePage
            },
            {
                path:'/storage/revise',
                name:'storageRevise',
                component: StorageRevise
            }
        ]
    },
    {
        path: "/manager",
        name: "manager",
        component: StorageManagementView
    },
    {
        path:'/storage/:storageCode',
        name:'storageDetail',
        component: StorageDetail
    },



];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;