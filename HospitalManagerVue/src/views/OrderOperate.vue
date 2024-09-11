<template>
    <div>
        <el-card>
            <!-- 面包屑 -->
            <el-breadcrumb separator-class="el-icon-arrow-right">
                <el-breadcrumb-item :to="{ path: '/orderOperate' }"
                    >科室选择</el-breadcrumb-item
                >
                <el-breadcrumb-item>日期选择</el-breadcrumb-item>
                <el-breadcrumb-item>预约</el-breadcrumb-item>
            </el-breadcrumb>
            <el-divider></el-divider>
            <div class="sectionIndex" style="font-size: 24px">
                <b> 内科类</b>
            </div>
            <ul>
                <li v-for="inter in inters" :key="inter">
                    <el-button
                        type="primary"
                        style="margin: 5px"
                        size="mini"
                        @click="sectionClick(inter)"
                        >{{ inter }}</el-button
                    >
                </li>
            </ul>
            <!-- <el-divider></el-divider> -->
            <!-- <div class="sectionIndex" style="font-size: 24px">
                <b> 外科类</b>
            </div> -->
            <!-- <ul>
                <li v-for="out in outs" :key="out">
                    <el-button
                        type="primary"
                        style="margin: 5px"
                        size="mini"
                        @click="sectionClick(out)"
                        >{{ out }}</el-button
                    >
                </li>
            </ul>
            <el-divider></el-divider>
            <div class="sectionIndex" style="font-size: 24px">
                <b> 妇产科类</b>
            </div>
            <ul>
                <li v-for="woman in women" :key="woman">
                    <el-button
                        type="primary"
                        style="margin: 5px"
                        size="mini"
                        @click="sectionClick(woman)"
                        >{{ woman }}</el-button
                    >
                </li>
            </ul>
            <el-divider></el-divider>
            <div class="sectionIndex" style="font-size: 24px">
                <b> 儿科类</b>
            </div>
            <ul>
                <li v-for="kid in kids" :key="kid">
                    <el-button
                        type="primary"
                        style="margin: 5px"
                        size="mini"
                        @click="sectionClick(kid)"
                        >{{ kid }}</el-button
                    >
                </li>
            </ul>
            <el-divider></el-divider>
            <div class="sectionIndex" style="font-size: 24px">
                <b> 五官科类</b>
            </div>
            <ul>
                <li v-for="five in fives" :key="five">
                    <el-button
                        type="primary"
                        style="margin: 5px"
                        size="mini"
                        @click="sectionClick(five)"
                        >{{ five }}</el-button
                    >
                </li>
            </ul>
            <el-divider></el-divider>
            <div class="sectionIndex" style="font-size: 24px">
                <b> 中医类</b>
            </div>
            <ul>
                <li v-for="chinese in chineses" :key="chinese">
                    <el-button
                        type="primary"
                        style="margin: 5px"
                        size="mini"
                        @click="sectionClick(chinese)"
                        >{{ chinese }}</el-button
                    >
                </li>
            </ul>
            <el-divider></el-divider>
            <div class="sectionIndex" style="font-size: 24px">
                <b> 其他类</b>
            </div> -->
            <ul>
                <li v-for="orther in orthers" :key="orther">
                    <el-button
                        type="primary"
                        style="margin: 5px"
                        size="mini"
                        @click="sectionClick(orther)"
                        >{{ orther }}</el-button
                    >
                </li>
            </ul>
            <el-divider></el-divider>
        </el-card>
    </div>
</template>
<script>

export default {
    name: "orderOperate",
    data() {
        return {
            inters: [
             
                "呼吸与危重症医学科",
                
            ]
            // outs: [
            //     "手足外科",
            //     "普通外科",
            //     "肛肠外科",
            //     "神经外科",
            //     "泌尿外科",
            //     "骨科",
            //     "烧伤整形外科",
            // ],
            // women: ["妇科", "产科"],
            // kids: ["儿科", "儿童保健科"],
            // fives: ["耳鼻咽喉科", "眼科", "口腔科"],
            // chineses: ["中医科"],
            // orthers: ["康复医学科", "急诊科", "皮肤性病科", "功能科"],
        };
    },
    methods: {
        //点击科室
        sectionClick(sectionOpt) {
            this.$router.push({
                path: "/sectionMessage?sectionOpt=" + sectionOpt,
            });
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