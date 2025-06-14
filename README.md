# EverYoungMall
# YoungMall - Modern E-commerce Platform

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.1.5-brightgreen.svg" alt="Spring Boot">
  <img src="https://img.shields.io/badge/React-18.2-blue.svg" alt="React">
  <img src="https://img.shields.io/badge/TypeScript-5.2-blue.svg" alt="TypeScript">
  <img src="https://img.shields.io/badge/MySQL-8.0-orange.svg" alt="MySQL">
  <img src="https://img.shields.io/badge/License-MIT-yellow.svg" alt="License">
</p>

A full-stack e-commerce platform built with microservices architecture, designed for seamless deployment across local and AWS environments.

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
git clone https://github.com/yourusername/youngmall.git
cd youngmall
```

### 2. Setup Project Structure
```bash
chmod +x setup-youngmall.sh
./setup-youngmall.sh
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
youngmall/
├── backend/                 # Spring Boot microservices
│   ├── youngmall-common/   # Shared utilities and configs
│   ├── youngmall-gateway/  # API Gateway
│   ├── youngmall-product/  # Product service
│   ├── youngmall-order/    # Order service
│   ├── youngmall-member/   # User service
│   ├── youngmall-ware/     # Inventory service
│   ├── youngmall-search/   # Search service
│   ├── youngmall-coupon/   # Promotion service
│   ├── youngmall-cart/     # Shopping cart service
│   └── youngmall-seckill/  # Flash sale service
├── frontend/               # React applications
│   └── youngmall-web/     # Web application
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
   cd backend/youngmall-product
   mvn spring-boot:run -Dspring.profiles.active=local
   ```

3. **Start Frontend Development Server**
   ```bash
   cd frontend/youngmall-web
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
cd frontend/youngmall-web
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
- Frontend: https://www.youngmall.com
- Backend API: https://api.youngmall.com
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
DATABASE_URL=jdbc:mysql://localhost:3306/youngmall
DATABASE_USERNAME=root
DATABASE_PASSWORD=password
```

AWS RDS MySQL:
```properties
DATABASE_URL=jdbc:mysql://your-rds-endpoint:3306/youngmall
DATABASE_USERNAME=youngmall_admin
DATABASE_PASSWORD=your-secure-password
```

### Storage Configuration

The application automatically switches storage implementations based on environment:

- **Local**: Files stored in `/tmp/youngmall/uploads`
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
cd frontend/youngmall-web
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

For support, email support@youngmall.com or join our Slack channel.

---

<p align="center">Made with ❤️ by the YoungMall Team</p>
