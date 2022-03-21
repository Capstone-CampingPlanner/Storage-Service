import { createWebHistory, createRouter } from "vue-router";

import storageVue from "@/views/storageVue";

const routes = [
    {
        path: "/",
        name: "Home",
        component: storageVue
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;