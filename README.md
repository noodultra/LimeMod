```markdown
# Lime Mod

![Mod Loader: Fabric](https://img.shields.io/badge/Mod%20Loader-Fabric-blue)
![Languages: Java & Kotlin](https://img.shields.io/badge/Languages-Java%20%7C%20Kotlin-blue)
![License: MIT](https://img.shields.io/badge/License-MIT-green)
![Code Style: Google](https://img.shields.io/badge/Code%20Style-Google-brightgreen)

## 关于模组

这是一个为 Minecraft Java版开发的食物扩展模组。为游戏添加了多种全新的食材、料理和烹饪相关机制。

当前版本包含：
- 基础食材与进阶料理
- 自定义合成配方
- 部分食物具有独特的状态效果

玩法设计正在完善中。

## 技术细节

- 模组加载器：Fabric 0.14.0+
- 开发语言：Java 17 + Kotlin 1.9.0
- 依赖：Fabric Language Kotlin

## 安装

1. 安装 Minecraft 对应版本的 Fabric Loader
2. 下载最新版本的模组 jar 文件
3. 放入 `.minecraft/mods` 文件夹
4. 启动游戏

## 开发环境

克隆仓库并运行：

```bash
git clone https://github.com/yourname/lime-mod.git
cd limemod
```


本项目遵循以下规范：

· Java：Google Java 风格指南（4空格缩进，Javadoc注释）
· Kotlin：官方 Kotlin 编码规范
· 命名：注册类字段使用 UPPER_SNAKE_CASE，其他遵循各语言惯例
· 包结构：按功能分包（item、block、recipe、effect、util）

提交前请确保通过代码检查：

```bash
./gradlew check
```

许可证

MIT

```
