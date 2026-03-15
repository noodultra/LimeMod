```markdown

## 📖 关于模组

这是一个为 Minecraft Java版 1.20.1 开发的食物扩展模组。为游戏添加了多种全新的食材、料理和烹饪相关机制。

✨ **当前版本包含：**
- 🥩 基础食材与进阶料理
- ⚙️ 自定义合成配方
- ✨ 部分食物具有独特的状态效果

🎮 **玩法设计**：正在完善中。

## 🔧 技术细节

- 🚀 模组加载器：Fabric 0.14.0+
- ☕ 开发语言：Java 17 + Kotlin 1.9.0
- 📦 依赖：Fabric Language Kotlin

## 📥 安装

1. 安装 Minecraft 和对应版本的 Fabric Loader
2. 下载最新版本的模组 jar 文件
3. 放入 `.minecraft/mods` 文件夹
4. 启动游戏

## 💻 开发环境

```bash
git clone https://github.com/yourname/lime-mod.git
cd limemod
```

构建产物位于 build/libs/ 目录。项目构建文件 build.gradle 位于根目录下。

📐 代码风格

· Java：Google Java 风格指南（4空格缩进，Javadoc注释）
· Kotlin：官方 Kotlin 编码规范
· 命名：注册类字段使用 UPPER_SNAKE_CASE
· 包结构：按功能分包（item、block、recipe、effect、util）

```bash
./gradlew check
