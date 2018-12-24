<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLongTitle">Feedbacks</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <c:forEach items="${feedbackList}" var="feedback">
                    <div class="card" style="margin:4px;">
                        <div class="card-body">
                            <blockquote class="blockquote mb-0">
                                <p>${feedback.feedback}.</p>
                                <footer class="blockquote-footer"><cite title="Source Title">${feedback.name}</cite></footer>
                            </blockquote>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>