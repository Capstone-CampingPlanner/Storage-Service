import {createWebHistory, createRouter} from "vue-router";
import StorageManagementView from "@/components/StorageMenagementView.vue";
import StorageService from "@/components/StorageService.vue";
import StorageDetail from "@/components/StorageDetail.vue";
import GetStoragePage from "@/components/GetStoragePage.vue";
import StorageAdd from "@/components/StorageAdd.vue";
import StorageRevise from "@/components/StorageRevise.vue";

const routes = [
    {
        path: "/",
        name: "home",
        component: StorageService
    },
    {
        path: "/storage",
        name: "storage",
        component: ()=> import('@/views/StorageView.vue'),
        children: [
            {
                path: '',
                component: GetStoragePage
            },
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
    // {
    //     path: "/get",
    //     name:'getStorage',
    //     component: GetStoragePage
    // },
    // {
    //     path: "/add",
    //     name: "addStorage",
    //     component: storageAdd
    // },
    // {
    //     path: "/revise",
    //     name: "storageRevise",
    //     component: storageRevise
    // },
    {
        path: "/manager",
        name: "manager",
        component: StorageManagementView
    },
    {
        path: '/storage/:storageCode',
        name: 'storageDetail',
        component: StorageDetail
    }


];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;