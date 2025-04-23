import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

         import users from '@/views/modules/users/list'
        import beijing from '@/views/modules/beijing/list'
        import beijingCollection from '@/views/modules/beijingCollection/list'
        import beijingXiazaijilu from '@/views/modules/beijingXiazaijilu/list'
        import dictionary from '@/views/modules/dictionary/list'
        import gonggao from '@/views/modules/gonggao/list'
        import singleSeach from '@/views/modules/singleSeach/list'
        import yonghu from '@/views/modules/yonghu/list'
        import yuansu from '@/views/modules/yuansu/list'
        import yuansuCollection from '@/views/modules/yuansuCollection/list'
        import yuansuXiazaijilu from '@/views/modules/yuansuXiazaijilu/list'
        import config from '@/views/modules/config/list'
        import dictionaryBeijing from '@/views/modules/dictionaryBeijing/list'
        import dictionaryBeijingBanshi from '@/views/modules/dictionaryBeijingBanshi/list'
        import dictionaryBeijingGeshi from '@/views/modules/dictionaryBeijingGeshi/list'
        import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
        import dictionarySex from '@/views/modules/dictionarySex/list'
        import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
        import dictionarySingleSeach from '@/views/modules/dictionarySingleSeach/list'
        import dictionaryYuansu from '@/views/modules/dictionaryYuansu/list'
        import dictionaryYuansuGeshi from '@/views/modules/dictionaryYuansuGeshi/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBeijing',
        name: '高清背景分类名称',
        component: dictionaryBeijing
    }
    ,{
        path: '/dictionaryBeijingBanshi',
        name: '板式',
        component: dictionaryBeijingBanshi
    }
    ,{
        path: '/dictionaryBeijingGeshi',
        name: '高清背景格式名称',
        component: dictionaryBeijingGeshi
    }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型名称',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型名称',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架名称',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionarySingleSeach',
        name: '单页数据类型',
        component: dictionarySingleSeach
    }
    ,{
        path: '/dictionaryYuansu',
        name: '元素分类名称',
        component: dictionaryYuansu
    }
    ,{
        path: '/dictionaryYuansuGeshi',
        name: '元素格式名称',
        component: dictionaryYuansuGeshi
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/beijing',
        name: '高清背景',
        component: beijing
      }
    ,{
        path: '/beijingCollection',
        name: '高清背景收藏',
        component: beijingCollection
      }
    ,{
        path: '/beijingXiazaijilu',
        name: '高清背景下载记录',
        component: beijingXiazaijilu
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/gonggao',
        name: '公告信息',
        component: gonggao
      }
    ,{
        path: '/singleSeach',
        name: '单页数据',
        component: singleSeach
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/yuansu',
        name: '免扣元素',
        component: yuansu
      }
    ,{
        path: '/yuansuCollection',
        name: '免扣元素收藏',
        component: yuansuCollection
      }
    ,{
        path: '/yuansuXiazaijilu',
        name: '免扣元素下载记录',
        component: yuansuXiazaijilu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
