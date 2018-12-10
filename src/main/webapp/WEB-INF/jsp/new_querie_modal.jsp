<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLongTitle">Create New Querie</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form method="post" id="new-querie-form">
                    <input type="hidden" name="faculty_Id" value="${faculty_profile.facultyId}">

                    <div class="input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text">Querie Description</span>
                        </div>
                        <textarea class="form-control" aria-label="With textarea" name="description"
                                  required></textarea>
                    </div>
                    <br>

                    <div class="input-group input-group-sm mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="opt-1">Option A</span>
                        </div>
                        <input type="text" class="form-control" aria-label="Small" aria-describedby="opt-1"
                               name="firstAnswer" required>
                    </div>

                    <div class="input-group input-group-sm mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="opt-2">Option B</span>
                        </div>
                        <input type="text" class="form-control" aria-label="Small" aria-describedby="opt-2"
                               name="secondAnswer" required>
                    </div>

                    <div class="input-group input-group-sm mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="opt-3">Option C</span>
                        </div>
                        <input type="text" class="form-control" aria-label="Small" aria-describedby="opt-3"
                               name="thirdAnswer" required>
                    </div>

                    <div class="input-group input-group-sm mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="opt-4">Option D</span>
                        </div>
                        <input type="text" class="form-control" aria-label="Small" aria-describedby="opt-4"
                               name="fourthAnswer" required>
                    </div>

                    <div class="input-group input-group-sm mb-3">
                        <select class="custom-select" name="correctAnswer" required>
                            <option value="A">A</option>
                            <option value="B">B</option>
                            <option value="C">C</option>
                            <option value="D">D</option>
                        </select>
                    </div>

                    <div class="input-group mb-3">
                        <input type="number" class="form-control" placeholder="Time Allocated" name="timeAllocated"
                               required>
                        <div class="input-group-append">
                            <span class="input-group-text">sec</span>
                        </div>
                    </div>
                    <div class="text-center">
                        <input type="submit" class="btn btn-success"></input>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
