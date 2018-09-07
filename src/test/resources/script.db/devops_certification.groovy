package script.db

databaseChangeLog(logicalFilePath: 'db/devops_certification.groovy') {
    changeSet(author: 'zhanglei', id: '2018-08-20-create-table') {
        createTable(tableName: "devops_certification", remarks: 'C7N Certification') {
            column(name: 'id', type: 'BIGINT UNSIGNED', remarks: '主键，ID', autoIncrement: true) {
                constraints(primaryKey: true)
            }

            column(name: 'name', type: 'VARCHAR(256)', remarks: '证书名字')
            column(name: 'env_id', type: 'BIGINT UNSIGNED', remarks: '环境id')
            column(name: 'domains', type: 'VARCHAR(1024)', remarks: '域名')
            column(name: 'status', type: 'VARCHAR(16)', remarks: '状态')

            column(name: "created_by", type: "BIGINT UNSIGNED", defaultValue: "0")
            column(name: "creation_date", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
            column(name: "last_updated_by", type: "BIGINT UNSIGNED", defaultValue: "0")
            column(name: "last_update_date", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
        }
    }
}