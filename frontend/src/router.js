import { createWebHistory, createRouter } from "vue-router";
import StorageMenagementView from "@/components/StorageMenagementView";

const routes = [
    {
        path: "/",
        name: "StorageMenagementView",
        component: StorageMenagementView
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;