package laundry.man

class CompanyBranchController {

    def index() {
        redirect(action: 'index', controller: 'purchase')
    }

    def save(){
        CompanyBranch branch = new CompanyBranch(address: params.address, branchName: params.branchName)
        branch.save()
    }

    def list() {
    }

    def listJson() {
        def items = CompanyBranch.list()
        render(contentType: "text/json"){

        }
    }

    def update(){
        CompanyBranch branch = CompanyBranch.get(1)
        branch.address = params.address
        branch.branchName = params.branchName
    }

    def delete(){
        CompanyBranch branch = CompanyBranch.get(1)
        branch.delete()
    }
}
