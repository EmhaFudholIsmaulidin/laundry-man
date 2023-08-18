package laundry.man

class CompanyBranchController {

    def index() {
        def branch = CompanyBranch.list()
        [branch: branch]
    }

    def create() {

    }

    def edit(Long id){
        def branch = CompanyBranch.get(id)
        [branch: branch]
    }

    def save() {
        def branch = new CompanyBranch(params)
        if (branch.save()) {
            flash.message = "Berhasil disimpan."
            redirect(action: "index", model: [params])
        } else {
            flash.message = "Ada yang salah, coba cek ${branch.branchName}, ${branch.address}}"
            render(view: "create", model: [params])
        }
    }

    def update() {
        def branch = CompanyBranch.get(params.editId)
        branch.branchName = params.branchName as String
        branch.address = params.address as String
        branch.save()

        flash.message = "${params.branchName} berhasil diedit."
        redirect(action: "index")
    }

    def delete() {
        def delete = CompanyBranch.get(params.id)
        if (delete){
            delete.delete()
            flash.message = "Berhasil dihapus."
            redirect(action: "index")
        }else{
            flash.message = "Gagal dihapus."
            redirect(action: "index")
        }
    }
}
