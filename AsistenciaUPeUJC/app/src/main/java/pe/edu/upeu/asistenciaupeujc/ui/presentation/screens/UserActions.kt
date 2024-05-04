package pe.edu.upeu.asistenciaupeujc.ui.presentation.screens

sealed class UserActions {
    object PlayAgainButtonClicked: UserActions()
    data class BoardTapped(val cellNo: Int): UserActions()
}