import { createWebHistory, createRouter } from "vue-router";
import StorageManagementView from "@/components/StorageMenagementView.vue";
import StorageView from "@/components/StorageView.vue";
import StorageService from "@/components/StorageService.vue";

const routes = [
    {
        path: "/",
        name: "home",
        component: StorageService
    },
    {
        path: "/storage",
        name: "storage",
        component: StorageView
    },
    {
        path: "/manager",
        name: "manager",
        component: StorageManagementView
    },


];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;