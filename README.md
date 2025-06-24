# EverEverYoungMall

# EverYoungMall - Modern E-commerce Platform

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.1.5-brightgreen.svg" alt="Spring Boot">
  <img src="https://img.shields.io/badge/React-18.2-blue.svg" alt="React">
  <img src="https://img.shields.io/badge/TypeScript-5.2-blue.svg" alt="TypeScript">
  <img src="https://img.shields.io/badge/MySQL-8.0-orange.svg" alt="MySQL">
  <img src="https://img.shields.io/badge/License-MIT-yellow.svg" alt="License">
</p>

📖 Introduction
EverYoungMall is a comprehensive e-commerce platform designed to showcase modern full-stack development practices. Built with a microservices architecture, it demonstrates how to create a scalable online shopping system that can seamlessly transition from local development to cloud deployment.
Key Features

Product Management: Browse products by categories, search, and filter options
Shopping Cart: Add items, update quantities, and manage cart persistently
Order Processing: Complete checkout flow with order tracking
User Authentication: Secure registration and login with JWT/AWS Cognito
Payment Integration: Support for multiple payment methods
Admin Dashboard: Manage products, orders, and users
Real-time Inventory: Track stock levels with automatic updates
Promotional System: Coupons and flash sales functionality

Why EverYoungMall?
This project serves as both a learning resource and a production-ready template for building modern e-commerce applications. It showcases:

Clean Architecture: Separation of concerns with microservices
Cloud-Native Design: Built for AWS but runs perfectly locally
Modern Tech Stack: Latest versions of Spring Boot, React, and TypeScript
DevOps Ready: Dockerized services with CI/CD pipeline support
Scalable Infrastructure: Designed to handle growth from startup to enterprise

Whether you're learning microservices, preparing for interviews, or starting your own e-commerce platform, EverYoungMall provides a solid foundation with best practices baked in.

## Project Strucutre

# 📦 Project Structure: EverYoungMall

```bash
EVERYOUNGMALL/
├── .idea/                 # IDE configuration files
├── .vscode/               # VS Code workspace settings
├── mall-admin/            # Admin service - handles back-office operations
├── mall-commons/          # Common utilities and shared modules
├── mall-coupon/           # Coupon service - manages discount and promotions
├── mall-member/           # Member service - handles user registration, auth, profile
├── mall-order/            # Order service - manages customer orders and payments
├── mall-product/          # Product service - manages product listing, details, etc.
├── mall-ware/             # Warehouse service - handles inventory and stock
```

## 🚀 Tech Stack

### Backend

- **Framework**: Spring Boot 3.x, Spring Cloud
- **Database**: MySQL 8.0 (JPA/Hibernate)
- **Cache**: Redis
- **Message Queue**: RabbitMQ
- **Search Engine**: Elasticsearch
- **Circuit Breaker**: Resilience4j
- **Cloud Services**: AWS (S3, RDS, ElastiCache, Cognito, etc.)

### Frontend

- **Framework**: React 18 + TypeScript
- **UI Library**: Material-UI (MUI)
- **State Management**: Redux Toolkit
- **Build Tool**: Vite
- **HTTP Client**: Axios
- **Testing**: Jest, Cypress

## 📋 Prerequisites

- Java 17+
- Node.js 18+
- Docker & Docker Compose
- Maven 3.8+
- AWS CLI (for AWS deployment)

## 🛠️ Quick Start

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/EverYoungMall.git
cd EverYoungMall
```

### 2. Setup Project Structure

```bash
chmod +x setup-EverYoungMall.sh
./setup-EverYoungMall.sh
```

### 3. Configure Environment

#### For Local Development

```bash
cp .env.local.template .env.local
# Edit .env.local with your local configurations
```

#### For AWS Production

```bash
cp .env.aws.template .env.aws
# Edit .env.aws with your AWS credentials and endpoints
```

## 🔄 Environment Management

### Switch Between Environments

```bash
# Switch to local environment
./switch-env.sh local

# Switch to AWS environment
./switch-env.sh aws

# Check current environment
./switch-env.sh
```

### Environment Variables

The project uses centralized environment configuration. All services read from the same environment files:

- `.env.local` - Local development settings
- `.env.aws` - AWS production settings

Key variables include:

- `DATABASE_URL` - MySQL connection string
- `REDIS_HOST` - Redis server address
- `STORAGE_TYPE` - Storage service (local/s3)
- `AUTH_TYPE` - Authentication service (jwt/cognito)

## 🚀 Deployment Commands

### Unified Deployment Script

```bash
# Deploy to local environment
./deploy.sh local

# Deploy to AWS environment
./deploy.sh aws

# Deploy specific components
./deploy.sh local backend    # Deploy only backend services
./deploy.sh aws frontend     # Deploy only frontend to AWS
./deploy.sh aws infra        # Deploy infrastructure only
```

### Quick Run Commands

```bash
# Start all services in local environment
./run.sh local

# Start specific service
./run.sh local product      # Start product service only
./run.sh local frontend     # Start frontend only

# Start in AWS mode (using AWS services)
./run.sh aws
```

## 🏗️ Project Structure

```
EverYoungMall/
├── backend/                 # Spring Boot microservices
│   ├── EverYoungMall-common/   # Shared utilities and configs
│   ├── EverYoungMall-gateway/  # API Gateway
│   ├── EverYoungMall-product/  # Product service
│   ├── EverYoungMall-order/    # Order service
│   ├── EverYoungMall-member/   # User service
│   ├── EverYoungMall-ware/     # Inventory service
│   ├── EverYoungMall-search/   # Search service
│   ├── EverYoungMall-coupon/   # Promotion service
│   ├── EverYoungMall-cart/     # Shopping cart service
│   └── EverYoungMall-seckill/  # Flash sale service
├── frontend/               # React applications
│   └── EverYoungMall-web/     # Web application
├── mobile/                 # React Native app
├── docker/                 # Docker configurations
├── k8s/                   # Kubernetes manifests
├── terraform/             # Infrastructure as Code
└── scripts/               # Utility scripts
```

## 💻 Development Workflow

### Local Development

1. **Start Infrastructure Services**

   ```bash
   docker-compose up -d
   ```

2. **Start Backend Services**

   ```bash
   cd backend/EverYoungMall-product
   mvn spring-boot:run -Dspring.profiles.active=local
   ```

3. **Start Frontend Development Server**
   ```bash
   cd frontend/EverYoungMall-web
   npm install
   npm run dev
   ```

### Build for Production

```bash
# Build all services
./build.sh all

# Build backend only
cd backend
mvn clean package -DskipTests

# Build frontend only
cd frontend/EverYoungMall-web
npm run build
```

## 🌐 Service URLs

### Local Environment

- Frontend: http://localhost:3000
- Backend API: http://localhost:8080
- Swagger UI: http://localhost:8080/swagger-ui.html
- MySQL: localhost:3306
- Redis: localhost:6379
- RabbitMQ Management: http://localhost:15672 (admin/admin)
- Elasticsearch: http://localhost:9200
- Consul UI: http://localhost:8500

### AWS Environment

- Frontend: https://www.EverYoungMall.com
- Backend API: https://api.EverYoungMall.com
- Services are managed through AWS Console

## 📦 Docker Services

Start all local services with Docker Compose:

```bash
# Start all services
docker-compose up -d

# View logs
docker-compose logs -f [service-name]

# Stop all services
docker-compose down

# Reset all data
docker-compose down -v
```

## 🔧 Configuration Details

### Database Configuration

Local MySQL:

```properties
DATABASE_URL=jdbc:mysql://localhost:3306/EverYoungMall
DATABASE_USERNAME=root
DATABASE_PASSWORD=password
```

AWS RDS MySQL:

```properties
DATABASE_URL=jdbc:mysql://your-rds-endpoint:3306/EverYoungMall
DATABASE_USERNAME=EverYoungMall_admin
DATABASE_PASSWORD=your-secure-password
```

### Storage Configuration

The application automatically switches storage implementations based on environment:

- **Local**: Files stored in `/tmp/EverYoungMall/uploads`
- **AWS**: Files stored in S3 bucket

### Authentication

- **Local**: JWT-based authentication
- **AWS**: AWS Cognito integration

## 🧪 Testing

```bash
# Run backend tests
cd backend
mvn test

# Run frontend tests
cd frontend/EverYoungMall-web
npm test

# Run E2E tests
npm run e2e
```

## 📈 Monitoring

### Local Environment

- Spring Boot Actuator endpoints: http://localhost:8080/actuator
- Custom health checks available at each service

### AWS Environment

- CloudWatch for logs and metrics
- X-Ray for distributed tracing
- Custom dashboards in CloudWatch

## 🚢 Production Deployment

### AWS Deployment Checklist

1. **Configure AWS Credentials**

   ```bash
   aws configure
   ```

2. **Update Environment Variables**

   ```bash
   vi .env.aws  # Update with your AWS resources
   ```

3. **Deploy Infrastructure**

   ```bash
   cd terraform
   terraform init
   terraform plan
   terraform apply
   ```

4. **Deploy Applications**
   ```bash
   ./deploy.sh aws
   ```

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Spring Boot team for the excellent framework
- React team for the powerful frontend library
- AWS for cloud infrastructure services
- All contributors who helped shape this project

## 📞 Support

For support, email support@EverYoungMall.com or join our Slack channel.

---

<p align="center">Made with ❤️ by the EverYoungMall Team</p>
