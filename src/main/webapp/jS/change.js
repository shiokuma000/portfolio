window.addEventListener("load", () => {
    const username = document.querySelector('input[name="name"]'); // ←nameに合わせる
    const password = document.querySelector('input[name="pass"]'); // ←passに合わせる
    if (username) username.value = "";
    if (password) password.value = "";
});

// ===== いいねボタン（ピンクに色変更、状態保持） =====
document.querySelectorAll('.like-btn').forEach(btn => {
  const heart = btn.querySelector('span');

  btn.addEventListener('click', () => {
    const current = heart.textContent.trim(); // ← trim 追加
    if (current === '♡') {
      heart.textContent = '♥';
      heart.classList.add('liked');
    } else {
      heart.textContent = '♡';
      heart.classList.remove('liked');
    }
  });
});


