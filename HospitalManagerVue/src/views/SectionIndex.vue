<template>
    <div>
        <el-card>
            <!-- <span>科室门诊</span> -->
            <el-divider></el-divider>
            <div class="sectionIndex" style="font-size: 24px">
                <b> 内科类</b>
            </div>
            <ul>
                <li v-for="inter in inters" :key="inter">
                    <el-button
                        style="margin: 5px"
                        @click="sectionClick(inter)"
                        >{{ inter }}</el-button
                    >
                </li>
            </ul>
            
            <el-divider></el-divider>
        </el-card>
    </div>
</template>
<script>

export default {
    name: "SectionIndex",
    data() {
        return {
            inters: [
         
                "呼吸与危重症医学科"
            ]
        };
    },
    methods: {
        //科室点击
        sectionClick(section) {
            this.$router.push({ path: "/arrangeDoctor?section=" + section });
        },
    },
    mounted() {
      
    }
};
</script>
<style scoped lang="scss">
ul li {
    display: inline;
}
.el-breadcrumb {
    margin: 8px;
}
</style>