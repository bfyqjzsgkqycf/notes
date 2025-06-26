# 袋鼠笔记

袋鼠笔记是一个面向程序员的在线笔记分享和学习平台，旨在为程序员提供一个高效的知识分享和交流空间。

## 项目特点

- 📝 支持 Markdown 格式的笔记编写
- 🔍 强大的笔记搜索功能
- 👥 用户互动和社交功能
- 📊 笔记数据统计和排行
- 🔔 实时消息通知系统
- 📱 响应式设计，支持多端访问

## 技术栈

**后端技术**

- 核心框架：Spring Boot 2.7.18
- 安全框架：Spring Security
- 持久层：MyBatis
- 数据库：MySQL 8.0
- 缓存：Redis
- 消息推送：WebSocket
- 搜索：MySQL 全文索引 + Jieba 分词
- 文件存储：本地文件系统
- 日志系统：Log4j2
- 测试框架：JUnit
- 模板引擎：Thymeleaf
- Markdown：Flexmark
- 工具库：Hutool

**前端技术**

- 构建工具：Vite
- 框架：React + TypeScript
- 路由管理：React Router DOM
- 状态管理：Redux Toolkit
- UI 库：Ant Design
- 样式：TailwindCSS
- HTTP 客户端：Axios
- WebSocket 客户端：原生 WebSoket
- Markdown 渲染
- 数据可视化
- 代码质量：ESLint, Prettier, Husky, Lint-staged

## 快速开始

### 环境要求
- Node.js 16+
- JDK 17+
- MySQL 8.0+
- Maven 3.8+

### 开发环境搭建

1. 克隆项目
```bash
git clone https://github.com/bfyqjzsgkqycf/notes.git
```

2. 前端启动
```bash
cd frontend
npm install
npm run dev
```

3. 后端启动
```bash
IDEA直接启动
或
cd backend
mvn spring-boot:run
```

4. 数据库配置
- 创建数据库：note_tech
  - `create database note_tech`
  - `use note_tech`
- 执行 SQL 脚本：note-tech.sql
- 执行 SQL 迁移脚本：migrate.sql

## 主要功能

### 1. 用户系统
- 用户注册和登录
- 个人信息管理
- 用户主页

### 2. 笔记管理
- 创建和编辑笔记
- 笔记分类和标签
- 笔记收藏
- 笔记搜索

### 3. 社交功能
- 笔记评论
- 点赞功能
- 消息通知

### 4. 数据统计
- 用户活跃度
- 笔记热度排行
- 个人数据统计

## 项目结构

```
├── backend/                # 后端项目
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/lsj/notes/
│   │   │   │       ├── annotation/   # 自定义注解
│   │   │   │       ├── aspect/       # AOP切面
│   │   │   │       ├── config/       # 配置类
│   │   │   │       ├── controller/   # 控制器
│   │   │   │       ├── exception/    # 异常处理
│   │   │   │       ├── filter/       # 过滤器
│   │   │   │       ├── interceptor/  # 拦截器
│   │   │   │       ├── mapper/       # 数据访问层
│   │   │   │       ├── model/        # 数据模型
│   │   │   │       ├── scope/        # 作用域数据
│   │   │   │       ├── service/      # 业务逻辑层
│   │   │   │       ├── task/         # 定时任务
│   │   │   │       └── utils/        # 工具类
│   │   │   └── resources/
│   │   │       ├── mapper/          # MyBatis映射文件
│   │   │       └── application.yml  # 配置文件
│   │   └── test/                    # 测试代码
│   └── pom.xml                      # 项目依赖管理
```
