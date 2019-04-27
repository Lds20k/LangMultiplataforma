#!/bin/bash
echo "Mensagem: "
read mensagem
sh change.sh
git add .
git commit -m "$mensagem"
sh remove.sh